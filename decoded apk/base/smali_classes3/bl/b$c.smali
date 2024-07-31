.class final Lbl/b$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbl/b;-><init>(ILok/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/q<",
        "Lhl/b<",
        "*>;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Lok/l<",
        "-",
        "Ljava/lang/Throwable;",
        "+",
        "Lck/v;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lbl/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbl/b<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lbl/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbl/b<",
            "TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lbl/b$c;->a:Lbl/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lhl/b;Ljava/lang/Object;Ljava/lang/Object;)Lok/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhl/b<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Lok/l<",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;"
        }
    .end annotation

    new-instance p2, Lbl/b$c$a;

    iget-object v0, p0, Lbl/b$c;->a:Lbl/b;

    invoke-direct {p2, p3, v0, p1}, Lbl/b$c$a;-><init>(Ljava/lang/Object;Lbl/b;Lhl/b;)V

    return-object p2
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhl/b;

    invoke-virtual {p0, p1, p2, p3}, Lbl/b$c;->a(Lhl/b;Ljava/lang/Object;Ljava/lang/Object;)Lok/l;

    move-result-object p1

    return-object p1
.end method
