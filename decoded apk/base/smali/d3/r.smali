.class public Ld3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Ld3/r;->a:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {p0}, Ld3/d;->b(Landroid/content/Context;)I

    move-result p0

    invoke-static {p0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    sput-object p0, Ld3/r;->a:Ljava/util/concurrent/ExecutorService;

    :cond_0
    sget-object p0, Ld3/r;->a:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method
