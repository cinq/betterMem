# betterMem
Better memory for people and events

## Model

List of the elements we will have in the application that will be
linked together

### Person
- name
- contacts [link]
- events [link]
    - birthday
    - first day we met

### Contact
- name
- type
- value

### Event
- name
- date [link]
- description

### Location
- name
- coordinate

### Date
- name
- date time

## Links

Main feature in this application is to link all the model objects
together to remember and navigate between them.

### Examples

1. The day I met someone for the first time
    - person : Manon
    - date : 2020-01-01
    - event : New Year Party
    - location : Henry's house

I want to be able to click on the event and see if any other person is linked to it.

1. Birthdays
    - person
    - date
    - event
    
If I looked at today's events I would be able to see the birthday's and remember that I need to text Henry a Happy Birthday. I could click on the Person to see what are the last events that we have shared together and it may remind me to make an inside joke with the wishes.

1. 