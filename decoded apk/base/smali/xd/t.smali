.class public final Lxd/t;
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

    iput-object p1, p0, Lxd/t;->a:Lxd/q;

    return-void
.end method

.method public static a(Lxd/q;)Lxd/t;
    .locals 1

    new-instance v0, Lxd/t;

    invoke-direct {v0, p0}, Lxd/t;-><init>(Lxd/q;)V

    return-object v0
.end method

.method public static c(Lxd/q;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0}, Lxd/q;->c()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/LayoutInflater;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/view/LayoutInflater;
    .locals 1

    iget-object v0, p0, Lxd/t;->a:Lxd/q;

    invoke-static {v0}, Lxd/t;->c(Lxd/q;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/t;->b()Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method
