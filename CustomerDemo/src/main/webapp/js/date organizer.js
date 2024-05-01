<script>
    // Function to format the date as mm/dd/yyyy
    function formatDate(input) {
        const value = input.value.replace(/\D/g, ''); // Remove non-numeric characters
        if (value.length >= 2) {
            input.value = value.slice(0, 2) + '/' + value.slice(2);
        }
        if (value.length >= 4) {
            input.value = value.slice(0, 5) + '/' + value.slice(5, 9);
        }
    }

    // Attach event listeners to date input fields
    const pickUpDateInput = document.getElementById('bookpick_date');
    const dropOffDateInput = document.getElementById('bookoff_date');

    pickUpDateInput.addEventListener('input', function() {
        formatDate(this);
    });

    dropOffDateInput.addEventListener('input', function() {
        formatDate(this);
    });
</script>