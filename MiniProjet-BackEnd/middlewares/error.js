export function notFoundError(req, res, next) {
    const error = new Error('Not Found');
    error.status = 404;
    res.status(error.status).json({
        message: "notFound",
    });
    next()
}