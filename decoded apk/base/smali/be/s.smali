.class public final Lbe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Ljava/util/concurrent/Executor;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/q;


# direct methods
.method public constructor <init>(Lbe/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/s;->a:Lbe/q;

    return-void
.end method

.method public static a(Lbe/q;)Lbe/s;
    .locals 1

    new-instance v0, Lbe/s;

    invoke-direct {v0, p0}, Lbe/s;-><init>(Lbe/q;)V

    return-object v0
.end method

.method public static c(Lbe/q;)Ljava/util/concurrent/Executor;
    .locals 0

    invoke-virtual {p0}, Lbe/q;->b()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lbe/s;->a:Lbe/q;

    invoke-static {v0}, Lbe/s;->c(Lbe/q;)Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/s;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method
