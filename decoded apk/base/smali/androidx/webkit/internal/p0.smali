.class public Landroidx/webkit/internal/p0;
.super Landroid/webkit/ServiceWorkerClient;
.source "SourceFile"


# instance fields
.field private final a:Le2/h;


# direct methods
.method public constructor <init>(Le2/h;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/ServiceWorkerClient;-><init>()V

    iput-object p1, p0, Landroidx/webkit/internal/p0;->a:Le2/h;

    return-void
.end method


# virtual methods
.method public shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 1

    iget-object v0, p0, Landroidx/webkit/internal/p0;->a:Le2/h;

    invoke-virtual {v0, p1}, Le2/h;->shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
