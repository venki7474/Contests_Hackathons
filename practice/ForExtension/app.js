function readFile() {
	jQuery.get('sample.txt',function(txt) {
		$('#output').text(txt);
	});
}