export function notFoundError(req, res, next) {
    const error = new Error(`Not Found `);
    res.status(404);
    next(err);
  }
  