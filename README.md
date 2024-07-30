# Gilded Tros Refactoring Kata
## Explanation design choices
My first thought would have been to separate the quality calculations and the Items as they have different tasks (Managing quality and holding the model data).

This is the reason I didn't choose to use inheritance and store the calculations in the specialized items. Also because a lot of items have similarities, but have a different decay or different grow pattern.
A visitor pattern would have been perfect for this since I would not have needed instance of checks to create the correct QualityManager.

Unfortunately, this didn't seem like the correct approach because both the Item class and Item property needed to be left untouched.
Therefore, I went with a factory pattern that delivers the correct quality calculations depending on the type of Item.

The factory could have been cleaner if Java 21 would have been used which has pattern switches.
Since the project language was set to Java 8, I decided to use simple if statements for now.