package boxresin.tmp.lib.mockmath

/** 주어진 매개변수 중, 최댓값을 반환한다. */
fun maxN(vararg nums: Int): Int {
	return nums.max() ?: 0
}

/** 주어진 매개변수 중, 최솟값을 반환한다. */
fun minN(vararg nums: Int): Int {
	return nums.min() ?: 0
}
