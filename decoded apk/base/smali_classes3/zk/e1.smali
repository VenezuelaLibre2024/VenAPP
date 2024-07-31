.class public final Lzk/e1;
.super Lzk/c2;
.source "SourceFile"


# instance fields
.field private final e:Lzk/c1;


# direct methods
.method public constructor <init>(Lzk/c1;)V
    .locals 0

    invoke-direct {p0}, Lzk/c2;-><init>()V

    iput-object p1, p0, Lzk/e1;->e:Lzk/c1;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lzk/e1;->v(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lzk/e1;->e:Lzk/c1;

    invoke-interface {p1}, Lzk/c1;->dispose()V

    return-void
.end method
