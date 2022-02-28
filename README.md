# Homework 2

1. Follow instructions in [wiki](https://gitlab.fi.muni.cz/grp-pv256/wiki/wikis/home)
and proceed with forking this repo
2. In `MainActivity` get instance of `TextFragment` and set its text to `FRAGMENT_TEXT`
  * Implement missing go to action to the `SecondActivity`
3. Create a new class `SecondFragment` leveraging the `newInstance` pattern and taking 1 argument of type String
  * Reuse the layout `fragment_text` (= don't create a new layout for this Fragment)
4. In `SecondActivity` create `SecondFragment` programmatically and pass it `FRAGMENT2_TEXT` that you received through intent
  * place it into the layout with id "container"
5. Submit changes into a **submit** branch and push it to your forked repo
6. Create a merge request against _your_ master branch and assign it to **xsevci11**, **ext-stefan.krajanec**, **xpanek1**, **xmasa**

Your commit must pass Gitlab CI verification. To test this locally, run:
```
./gradlew check
```
