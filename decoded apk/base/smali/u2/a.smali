.class public Lu2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lt2/c;

.field static b:Lt2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu2/c;

    invoke-direct {v0}, Lu2/c;-><init>()V

    sput-object v0, Lu2/a;->a:Lt2/c;

    new-instance v0, Lu2/b;

    invoke-direct {v0}, Lu2/b;-><init>()V

    sput-object v0, Lu2/a;->b:Lt2/b;

    new-instance v0, Lu2/d;

    invoke-direct {v0}, Lu2/d;-><init>()V

    invoke-static {v0}, Lt2/a;->p(Lt2/d;)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    new-instance v0, Lt2/f;

    invoke-direct {v0, p0}, Lt2/f;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lt2/a;->f(Lt2/f;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lt2/a;->o(Ljava/lang/String;)V

    return-void
.end method
