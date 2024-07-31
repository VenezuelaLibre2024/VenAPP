.class public final synthetic Lt8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic b:I

.field public final synthetic c:Lt8/r$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILt8/r$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/q;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lt8/q;->b:I

    iput-object p3, p0, Lt8/q;->c:Lt8/r$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lt8/q;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget v1, p0, Lt8/q;->b:I

    iget-object v2, p0, Lt8/q;->c:Lt8/r$a;

    invoke-static {v0, v1, v2}, Lt8/r;->a(Ljava/util/concurrent/CopyOnWriteArraySet;ILt8/r$a;)V

    return-void
.end method
