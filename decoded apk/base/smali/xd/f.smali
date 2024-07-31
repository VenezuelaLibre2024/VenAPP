.class public final Lxd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# instance fields
.field private final a:Lxd/e;


# direct methods
.method public constructor <init>(Lxd/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/f;->a:Lxd/e;

    return-void
.end method

.method public static a(Lxd/e;)Lxd/f;
    .locals 1

    new-instance v0, Lxd/f;

    invoke-direct {v0, p0}, Lxd/f;-><init>(Lxd/e;)V

    return-object v0
.end method

.method public static c(Lxd/e;)Lqd/q;
    .locals 0

    invoke-virtual {p0}, Lxd/e;->a()Lqd/q;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqd/q;

    return-object p0
.end method


# virtual methods
.method public b()Lqd/q;
    .locals 1

    iget-object v0, p0, Lxd/f;->a:Lxd/e;

    invoke-static {v0}, Lxd/f;->c(Lxd/e;)Lqd/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/f;->b()Lqd/q;

    move-result-object v0

    return-object v0
.end method
