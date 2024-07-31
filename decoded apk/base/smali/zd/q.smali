.class public final synthetic Lzd/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzd/s$b;

.field public final synthetic b:Lde/i;


# direct methods
.method public synthetic constructor <init>(Lzd/s$b;Lde/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/q;->a:Lzd/s$b;

    iput-object p2, p0, Lzd/q;->b:Lde/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/q;->a:Lzd/s$b;

    iget-object v1, p0, Lzd/q;->b:Lde/i;

    invoke-static {v0, v1}, Lzd/s;->a(Lzd/s$b;Lde/i;)V

    return-void
.end method
