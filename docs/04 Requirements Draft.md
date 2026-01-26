**Team PRIJ:** Peter Brumbach, Ryan Merrick, Isaiah Zimmerman, James Yoho
# 📦 Project Requirements

This document lists the requirements for the project.
It is expected to change as requirements are refined.

---

## 🚀 MVP Requirements

- [ ] **R1: Schedule add** A user should be able to add a course to a candidate schedule.
	- [ ] **R1-1** As a user, I don't want to accidentally add a course that conflicts with my current classes. I should be prevented from doing this (unless I know better, in which case I should be able to manually override).
		- NOTE: An example of this would be adding Concert Choir for audit and another ("conflicting") class on Fridays at 4 - I will still be able to take this class and just miss Fridays and I want my scheduling app to reflect that reality
	- [ ] **R1-2** As a user, I should be able to add classes that put me over 18 credits for a single semester, but I should receive a warning message when I add the class that pushes me over 18 credits.
- [ ] **R2: Schedule removal** As a user, I should be able to remove courses from my candidate schedule from the search view or from a list of my classes
- [ ] **R3: Robust Search** As a user, I should be able to search for a class by its course code or keywords
	- [ ] **R3-1** As a user, I should be able to filter by classes that fit in my current schedule for a given semester (current, i.e. add/drop OR future, i.e. "next semester").
	- [ ] **R3-2** As a user, I should be able to search for a professor and see classes that are taught by that professor
	- [ ] **R3-3** As a user, I should be able to explore a department's offerings
	- [ ] **R3-4** As a user, I should be able to filter credit hours based on a range that I define
- [ ] **R4: Calendar view/schedule overview** As a user, I should be able to navigate to a calendar which shows all of my currently scheduled classes. I should be able to click on these classes for more information.
	- [ ] **R4-1** As a user, I want to see some insights, like how many total credits I'm taking
- [ ] **R5: Data persistence** As a user, my classes should be available to me, even if I exit the web page. It should save my classes.

---
## ✨ Additional Features

- [ ] **F1: User ratings** As a user, I should be able to see what others think about the class.
	- [ ] **F1-1** I should be able to rate a class that I took with a particular professor, knowing that some classes are taught by many professors
	- [ ] **F1-2** Rating a professor should be easy - I should be able to say a class is easy, average, or hard, and I should be able to rate a class on quality, from bad, to average, to good.
- [ ] **F2: Degree progress** As a user, I should be able to see which classes I have remaining for my major
	- NOTE: This is something that the user would probably have to enter themselves, unless we figured out a relatively simple script that could scrape degree requirements from the status sheet PDFs
	- [ ] **F2-1** As a user, I want to be able to see my progress on my minor as well, with credits taken and remaining, and eligible classes
	- NOTE: This would probably be accomplished through some combination of nested AND and OR statements for classes, and we'd want a way to make this clean and simple but still powerful.

---

> [!info] These requirements can only be modified with agreement between both the dev team and the customer.
