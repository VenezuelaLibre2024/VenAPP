.class final Lel/z$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lel/z;->a(Lok/l;Ljava/lang/Object;Lgk/f;)Lok/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/lang/Throwable;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "TE;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic c:Lgk/f;


# direct methods
.method constructor <init>(Lok/l;Ljava/lang/Object;Lgk/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-TE;",
            "Lck/v;",
            ">;TE;",
            "Lgk/f;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lel/z$a;->a:Lok/l;

    iput-object p2, p0, Lel/z$a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lel/z$a;->c:Lgk/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lel/z$a;->a:Lok/l;

    iget-object v0, p0, Lel/z$a;->b:Ljava/lang/Object;

    iget-object v1, p0, Lel/z$a;->c:Lgk/f;

    invoke-static {p1, v0, v1}, Lel/z;->b(Lok/l;Ljava/lang/Object;Lgk/f;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lel/z$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
