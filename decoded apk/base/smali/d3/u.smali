.class public final synthetic Ld3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lcom/bluechilli/flutteruploader/UploadWorker;


# direct methods
.method public synthetic constructor <init>(Lcom/bluechilli/flutteruploader/UploadWorker;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/u;->a:Lcom/bluechilli/flutteruploader/UploadWorker;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld3/u;->a:Lcom/bluechilli/flutteruploader/UploadWorker;

    invoke-static {v0, p1}, Lcom/bluechilli/flutteruploader/UploadWorker;->e(Lcom/bluechilli/flutteruploader/UploadWorker;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
