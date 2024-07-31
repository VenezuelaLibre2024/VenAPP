.class public final synthetic Lzd/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzd/s$a;

.field public final synthetic b:Lde/i;

.field public final synthetic c:Lde/a;


# direct methods
.method public synthetic constructor <init>(Lzd/s$a;Lde/i;Lde/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/r;->a:Lzd/s$a;

    iput-object p2, p0, Lzd/r;->b:Lde/i;

    iput-object p3, p0, Lzd/r;->c:Lde/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lzd/r;->a:Lzd/s$a;

    iget-object v1, p0, Lzd/r;->b:Lde/i;

    iget-object v2, p0, Lzd/r;->c:Lde/a;

    invoke-static {v0, v1, v2}, Lzd/s;->b(Lzd/s$a;Lde/i;Lde/a;)V

    return-void
.end method
