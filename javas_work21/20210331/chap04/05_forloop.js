const todos = ['우유구매','메일확인','필라테스']
for (const i in todos)
{
//    console.log(i+"번째 할 일"+todos[i])
    console.log(`${(Number(i)+1)}번째 할 일 : ${todos[i]}`)
}