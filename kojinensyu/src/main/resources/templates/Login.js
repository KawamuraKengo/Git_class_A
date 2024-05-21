import React, { useState } from 'react';

const Login = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleLogin = async () => {
        // ユーザーのログイン情報をサーバーに送信するAPI呼び出しを実装
    };

    return (
        <div>
            <input type="text" placeholder="ユーザー名" value={username} onChange={(e) => setUsername(e.target.value)} />
            <input type="password" placeholder="パスワード" value={password} onChange={(e) => setPassword(e.target.value)} />
            <button onClick={handleLogin}>ログイン</button>
        </div>
    );
};

export default Login;
