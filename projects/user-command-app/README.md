
# Design User Management system using Command Line Interface (CLI)

## Features
- Create User using command as create
  - Provide user attributes 
    - as -n for name, -p for phone, -a for address, -e for email id

- Read User using command as read
    - Provide user attributes
        - -n for name, read user by name
        - -i for id, read user by id
        - p for phone, read user by phone
      
- Delete User using command as delete
    - Provide user attributes
        - -n for name, delete user by name
        - -i for id, delete user by id
- Update Action

Break Down
- action
- attributes (input)
- result (output)


Create Action
- Action Name : Create
- Attributes: -n, -p, -a, -e
- Result: Message with ID / Duplicate User not allowed!

Read Action
- Action Name : Read
- Attributes: -i, -n, -all, 
- Result: User Object (single User information) by id
- Result: (-all) User Objects (multiple user Information) by all

Delete Action
- Action Name : Delete
- Attributes: -i
- Result: message / User doesn't exists (success/failure)


- User model
- Command interface
- User store use HashMap

```
public interface Command{ 
    public Result execute(String[] attributes);
}

public class Result{
    String message;
    List<User> users;
}
public class CreateCommand implements Command{

    public Result execute(String[] attributes){
        // logic for creating user
    }
}

public class ReadCommand implements Command{

    public Result execute(String[] attributes){
        // logic for reading user
    }
}

public class DeleteCommand implements Command{

    public Result execute(String[] attributes){
        // logic for deleting user
    }
}

public class UpdateCommand implements Command{

    public Result execute(String[] attributes){
        // logic for update user
    }
}
```