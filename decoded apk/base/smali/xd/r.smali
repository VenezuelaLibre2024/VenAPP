.class public final Lxd/r;
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
.field private final a:Lxd/q;


# direct methods
.method public constructor <init>(Lxd/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/r;->a:Lxd/q;

    return-void
.end method

.method public static a(Lxd/q;)Lxd/r;
    .locals 1

    new-instance v0, Lxd/r;

    invoke-direct {v0, p0}, Lxd/r;-><init>(Lxd/q;)V

    return-object v0
.end method

.method public static c(Lxd/q;)Lud/l;
    .locals 0

    invoke-virtual {p0}, Lxd/q;->a()Lud/l;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud/l;

    return-object p0
.end method


# virtual methods
.method public b()Lud/l;
    .locals 1

    iget-object v0, p0, Lxd/r;->a:Lxd/q;

    invoke-static {v0}, Lxd/r;->c(Lxd/q;)Lud/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/r;->b()Lud/l;

    move-result-object v0

    return-object v0
.end method
