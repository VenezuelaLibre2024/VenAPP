.class public final Ldg/d;
.super Ldg/p;
.source "SourceFile"


# static fields
.field private static final c:Ldg/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldg/d;

    invoke-direct {v0}, Ldg/d;-><init>()V

    sput-object v0, Ldg/d;->c:Ldg/d;

    sget-object v1, Ldg/p;->b:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldg/p;-><init>()V

    return-void
.end method

.method public static a()Ldg/d;
    .locals 1

    sget-boolean v0, Ldg/p;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ldg/d;

    invoke-direct {v0}, Ldg/d;-><init>()V

    goto :goto_0

    :cond_0
    sget-object v0, Ldg/d;->c:Ldg/d;

    :goto_0
    return-object v0
.end method
