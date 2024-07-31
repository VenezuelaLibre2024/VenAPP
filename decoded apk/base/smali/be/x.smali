.class public final Lbe/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lvi/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/w;

.field private final b:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbe/w;Lbk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/w;",
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/x;->a:Lbe/w;

    iput-object p2, p0, Lbe/x;->b:Lbk/a;

    return-void
.end method

.method public static a(Lbe/w;Lbk/a;)Lbe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbe/w;",
            "Lbk/a<",
            "Ljava/lang/String;",
            ">;)",
            "Lbe/x;"
        }
    .end annotation

    new-instance v0, Lbe/x;

    invoke-direct {v0, p0, p1}, Lbe/x;-><init>(Lbe/w;Lbk/a;)V

    return-object v0
.end method

.method public static c(Lbe/w;Ljava/lang/String;)Lvi/d;
    .locals 0

    invoke-virtual {p0, p1}, Lbe/w;->a(Ljava/lang/String;)Lvi/d;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvi/d;

    return-object p0
.end method


# virtual methods
.method public b()Lvi/d;
    .locals 2

    iget-object v0, p0, Lbe/x;->a:Lbe/w;

    iget-object v1, p0, Lbe/x;->b:Lbk/a;

    invoke-interface {v1}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lbe/x;->c(Lbe/w;Ljava/lang/String;)Lvi/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/x;->b()Lvi/d;

    move-result-object v0

    return-object v0
.end method
