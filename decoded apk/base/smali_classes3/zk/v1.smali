.class final Lzk/v1;
.super Lzk/c2;
.source "SourceFile"


# instance fields
.field private final e:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lok/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lzk/c2;-><init>()V

    iput-object p1, p0, Lzk/v1;->e:Lok/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lzk/v1;->v(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lzk/v1;->e:Lok/l;

    invoke-interface {v0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
