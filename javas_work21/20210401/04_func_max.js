function min(array)
{
    let output = array[]
    for(const item of array)
    {
        if(output > item) // item이 더작다면
            output = item
    }
    return output
}
function max(array)
{
    let output = array[]
    for(const item of array)
    {
        if(output < item) // item이 더작다면
            output = item
    }
    return output
}



const testarray = [57,273,32,103,275,24,57]
console.log(`${testarray}중에서`)
console.log(`최솟값=${min(testarray)}`)
console.log(`최솟값=${max(testarray)}`)