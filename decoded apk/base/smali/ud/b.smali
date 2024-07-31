.class public final Lud/b;
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
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud/b;->a:Lbk/a;

    return-void
.end method

.method public static a(Lbk/a;)Lud/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)",
            "Lud/b;"
        }
    .end annotation

    new-instance v0, Lud/b;

    invoke-direct {v0, p0}, Lud/b;-><init>(Lbk/a;)V

    return-object v0
.end method

.method public static c(Landroid/app/Application;)Lud/a;
    .locals 1

    new-instance v0, Lud/a;

    invoke-direct {v0, p0}, Lud/a;-><init>(Landroid/app/Application;)V

    return-object v0
.end method


# virtual methods
.method public b()Lud/a;
    .locals 1

    iget-object v0, p0, Lud/b;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lud/b;->c(Landroid/app/Application;)Lud/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lud/b;->b()Lud/a;

    move-result-object v0

    return-object v0
.end method
