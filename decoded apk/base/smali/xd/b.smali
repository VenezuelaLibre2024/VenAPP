.class public final Lxd/b;
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
.field private final a:Lxd/a;


# direct methods
.method public constructor <init>(Lxd/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/b;->a:Lxd/a;

    return-void
.end method

.method public static a(Lxd/a;)Lxd/b;
    .locals 1

    new-instance v0, Lxd/b;

    invoke-direct {v0, p0}, Lxd/b;-><init>(Lxd/a;)V

    return-object v0
.end method

.method public static c(Lxd/a;)Landroid/app/Application;
    .locals 0

    invoke-virtual {p0}, Lxd/a;->a()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Ltd/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lxd/b;->a:Lxd/a;

    invoke-static {v0}, Lxd/b;->c(Lxd/a;)Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxd/b;->b()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method
