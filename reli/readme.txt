// 1. version auf '2.0.0' setzen, commit
// 2. git tag 2.0.0, push
// 3. gradlew dist -Pver=2.0.0
// 4. version auf '2.1.0-SNAPSHOT" setzen, commit + push






// Parameter: -Pver=2.x
task branch
branch.doFirst {
	if (!hasProperty('ver'))
		throw new GradleException("Parameter 'ver' muss angegeben werden!")
	if (!ver.endsWith('.x'))
		throw new GradleException("Parameter 'ver' muss mit '.x' enden!")
}
branch << {
	git "branch $ver"
	// TODO push neuen branch
	// version = '3.0.0-SNAPSHOT' (im master)   + git commit    + git push
}
