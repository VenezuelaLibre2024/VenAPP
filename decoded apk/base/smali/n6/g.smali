.class public final Ln6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lo6/f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lr6/a;",
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
            "Lr6/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/g;->a:Lbk/a;

    return-void
.end method

.method public static a(Lr6/a;)Lo6/f;
    .locals 1

    invoke-static {p0}, Ln6/f;->a(Lr6/a;)Lo6/f;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lj6/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo6/f;

    return-object p0
.end method

.method public static b(Lbk/a;)Ln6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lr6/a;",
            ">;)",
            "Ln6/g;"
        }
    .end annotation

    new-instance v0, Ln6/g;

    invoke-direct {v0, p0}, Ln6/g;-><init>(Lbk/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Lo6/f;
    .locals 1

    iget-object v0, p0, Ln6/g;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/a;

    invoke-static {v0}, Ln6/g;->a(Lr6/a;)Lo6/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ln6/g;->c()Lo6/f;

    move-result-object v0

    return-object v0
.end method
