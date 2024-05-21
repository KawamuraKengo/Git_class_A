import React, { useState, useEffect } from 'react';

const TodoList = ({ userId }) => {
    const [todoLists, setTodoLists] = useState([]);

    useEffect(() => {
        const fetchTodoLists = async () => {
            // ユーザーIDに基づいてToDoリストを取得するAPI呼び出しを実装
        };
        fetchTodoLists();
    }, [userId]);

    return (
        <div>
            <h2>ToDoリスト</h2>
            <ul>
                {todoLists.map(todoList => (
                    <li key={todoList.id}>{todoList.title}</li>
                ))}
            </ul>
        </div>
    );
};

export default TodoList;
