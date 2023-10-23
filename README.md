# santander-bootcamp-2023

##Diagramas de Classes

```mermaid
classDiagram
  class Task {
    +taskId: int
    +title: string
    +description: string
    +completed: boolean
    +dueDate: date
    +createdAt: date
    +updatedAt: date
    +user: User
  }

  class TaskList {
    +taskListId: int
    +title: string
    +tasks: List<Task>
  }

  class User {
    +userId: int
    +username: string
    +email: string
    +taskLists: List<TaskList>
  }

  TaskList -- Task : Contains
  User -- TaskList : Owns
  User -- Task : Creates, Manages




```
