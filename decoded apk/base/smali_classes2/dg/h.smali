.class public final Ldg/h;
.super Ldg/p;
.source "SourceFile"


# static fields
.field private static final c:Ldg/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldg/h;

    invoke-direct {v0}, Ldg/h;-><init>()V

    sput-object v0, Ldg/h;->c:Ldg/h;

    sget-object v1, Ldg/p;->b:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldg/p;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Ldg/p;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a()Ldg/h;
    .locals 1

    sget-boolean v0, Ldg/p;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ldg/h;

    invoke-direct {v0}, Ldg/h;-><init>()V

    goto :goto_0

    :cond_0
    sget-object v0, Ldg/h;->c:Ldg/h;

    :goto_0
    return-object v0
.end method

.method public static b(Ljava/lang/Throwable;)Ldg/h;
    .locals 1

    sget-boolean v0, Ldg/p;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ldg/h;

    invoke-direct {v0, p0}, Ldg/h;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    sget-object v0, Ldg/h;->c:Ldg/h;

    :goto_0
    return-object v0
.end method