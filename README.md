Lab1
====

Homework
---

For homework, we are going to ask you guys to create a simple to do list. You can find [the example demo here](https://vimeo.com/74014220). To start the lab, fork and clone Lab1. It has all the files from a finished Lab 0.5, which will help you out as a starting point.

To break the homework down into more detail, the specs are:
* 1 Activity / View
* 1 Text field with a character limit of 10 characters
* A button to add a new task
* Labels for the tasks (which you made in the layouts above, they say "Click the button to go back to activity 1")
* Delete buttons to delete the tasks that you have added

Some useful hints. First of all, you know most of this stuff, since we just covered it in Lab 0.5. Look back at what we did for reference.
* The add button and delete buttons will need an onClickListener. The add button will add a new label to the view and the delete buttons will delete labels from the views
* Check out the [layouts tutorial, especially the list views portion](http://developer.android.com/guide/topics/ui/layout/listview.html) since a to-do list can be done with a listview
* The text field can be added via xml using a textfield item. You can google for the syntax. Here is a place to get you started.

```
<EditText android:id="@+id/edit_message"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="@string/edit_message" />
```

Check out [the Android tutorial site](http://developer.android.com/training/basics/firstapp/building-ui.html#TextInput) for more info on text fields

Tim, Evan, and Juliana will be in SF from Thursday - Sunday, which is why we are giving you guys a challenging homework assignment. Google for answers first, then email us, text us, find us in EH. Along with our usual office hours, we will set up another time to either hold Google hangout office hours or have office hours on Sunday night.