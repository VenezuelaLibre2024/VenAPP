.class public final synthetic Ld3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/bluechilli/flutteruploader/UploadWorker;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Lcom/bluechilli/flutteruploader/UploadWorker;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/v;->a:Lcom/bluechilli/flutteruploader/UploadWorker;

    iput-object p2, p0, Ld3/v;->b:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld3/v;->a:Lcom/bluechilli/flutteruploader/UploadWorker;

    iget-object v1, p0, Ld3/v;->b:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1}, Lcom/bluechilli/flutteruploader/UploadWorker;->d(Lcom/bluechilli/flutteruploader/UploadWorker;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method
