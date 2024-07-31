.class public final Lbe/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lij/a<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lbe/u;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/u;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/u;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/v;->a:Lbe/u;

    iput-object p2, p0, Lbe/v;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbe/u;Lbk/a;)Lbe/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/u;",
            "Lbk/a<",
            "Landroid/app/Application;",
            ">;)",
            "Lbe/v;"
        }
    .end annotation

    new-instance v0, Lbe/v;

    invoke-direct {v0, p0, p1}, Lbe/v;-><init>(Lbe/u;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/u;Landroid/app/Application;)Lij/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/u;",
            "Landroid/app/Application;",
            ")",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lbe/u;->a(Landroid/app/Application;)Lij/a;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lij/a;

    return-object p0
.end method


# virtual methods
.method public b()Lij/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbe/v;->a:Lbe/u;

    iget-object v1, p0, Lbe/v;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-static {v0, v1}, Lbe/v;->c(Lbe/u;Landroid/app/Application;)Lij/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/v;->b()Lij/a;

    move-result-object v0

    return-object v0
.end method
