.class public final Lxd/s;
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

    iput-object p1, p0, Lxd/s;->a:Lxd/q;

    return-void
.end method

.method public static a(Lxd/q;)Lxd/s;
    .locals 1

    new-instance v0, Lxd/s;

    invoke-direct {v0, p0}, Lxd/s;-><init>(Lxd/q;)V

    return-object v0
.end method

.method public static c(Lxd/q;)Lde/i;
    .locals 0

    invoke-virtual {p0}, Lxd/q;->b()Lde/i;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lde/i;

    return-object p0
.end method


# virtual methods
.method public b()Lde/i;
    .locals 1

    iget-object v0, p0, Lxd/s;->a:Lxd/q;

    invoke-static {v0}, Lxd/s;->c(Lxd/q;)Lde/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/s;->b()Lde/i;

    move-result-object v0

    return-object v0
.end method
