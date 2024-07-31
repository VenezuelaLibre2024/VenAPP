.class final Lzk/d2$b;
.super Lzk/c2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzk/d2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final e:Lzk/d2;

.field private final f:Lzk/d2$c;

.field private final r:Lzk/t;

.field private final s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzk/d2;Lzk/d2$c;Lzk/t;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lzk/c2;-><init>()V

    iput-object p1, p0, Lzk/d2$b;->e:Lzk/d2;

    iput-object p2, p0, Lzk/d2$b;->f:Lzk/d2$c;

    iput-object p3, p0, Lzk/d2$b;->r:Lzk/t;

    iput-object p4, p0, Lzk/d2$b;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lzk/d2$b;->v(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lzk/d2$b;->e:Lzk/d2;

    iget-object v0, p0, Lzk/d2$b;->f:Lzk/d2$c;

    iget-object v1, p0, Lzk/d2$b;->r:Lzk/t;

    iget-object v2, p0, Lzk/d2$b;->s:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lzk/d2;->p(Lzk/d2;Lzk/d2$c;Lzk/t;Ljava/lang/Object;)V

    return-void
.end method
