.class public final synthetic Lzd/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzd/s$c;

.field public final synthetic b:Lde/i;

.field public final synthetic c:Lqd/t$b;


# direct methods
.method public synthetic constructor <init>(Lzd/s$c;Lde/i;Lqd/t$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/o;->a:Lzd/s$c;

    iput-object p2, p0, Lzd/o;->b:Lde/i;

    iput-object p3, p0, Lzd/o;->c:Lqd/t$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lzd/o;->a:Lzd/s$c;

    iget-object v1, p0, Lzd/o;->b:Lde/i;

    iget-object v2, p0, Lzd/o;->c:Lqd/t$b;

    invoke-static {v0, v1, v2}, Lzd/s;->d(Lzd/s$c;Lde/i;Lqd/t$b;)V

    return-void
.end method
