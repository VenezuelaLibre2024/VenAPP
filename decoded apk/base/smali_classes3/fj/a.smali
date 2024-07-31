.class public final Lfj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfj/a$b;
    }
.end annotation


# static fields
.field private static final a:Ldj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfj/a$a;

    invoke-direct {v0}, Lfj/a$a;-><init>()V

    invoke-static {v0}, Lej/a;->d(Ljava/util/concurrent/Callable;)Ldj/r;

    move-result-object v0

    sput-object v0, Lfj/a;->a:Ldj/r;

    return-void
.end method

.method public static a()Ldj/r;
    .locals 1

    sget-object v0, Lfj/a;->a:Ldj/r;

    invoke-static {v0}, Lej/a;->e(Ldj/r;)Ldj/r;

    move-result-object v0

    return-object v0
.end method
