.class final Lil/b$b;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil/b;-><init>(Z)V
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
.field final synthetic a:Lil/b;


# direct methods
.method constructor <init>(Lil/b;)V
    .locals 0

    iput-object p1, p0, Lil/b$b;->a:Lil/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lhl/b;Ljava/lang/Object;Ljava/lang/Object;)Lok/l;
    .locals 0
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

    new-instance p1, Lil/b$b$a;

    iget-object p3, p0, Lil/b$b;->a:Lil/b;

    invoke-direct {p1, p3, p2}, Lil/b$b$a;-><init>(Lil/b;Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhl/b;

    invoke-virtual {p0, p1, p2, p3}, Lil/b$b;->a(Lhl/b;Ljava/lang/Object;Ljava/lang/Object;)Lok/l;

    move-result-object p1

    return-object p1
.end method
