.class public final Lbe/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Landroid/app/Application;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/n;


# direct methods
.method public constructor <init>(Lbe/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/p;->a:Lbe/n;

    return-void
.end method

.method public static a(Lbe/n;)Lbe/p;
    .locals 1

    new-instance v0, Lbe/p;

    invoke-direct {v0, p0}, Lbe/p;-><init>(Lbe/n;)V

    return-object v0
.end method

.method public static c(Lbe/n;)Landroid/app/Application;
    .locals 0

    invoke-virtual {p0}, Lbe/n;->b()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lbe/p;->a:Lbe/n;

    invoke-static {v0}, Lbe/p;->c(Lbe/n;)Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/p;->b()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method
