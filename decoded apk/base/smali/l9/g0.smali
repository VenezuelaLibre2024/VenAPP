.class public final synthetic Ll9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ll9/c;

.field public final synthetic b:Landroid/net/Uri;

.field public final synthetic c:Lcom/google/android/gms/dynamic/b;


# direct methods
.method public synthetic constructor <init>(Ll9/c;Landroid/net/Uri;Lcom/google/android/gms/dynamic/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/g0;->a:Ll9/c;

    iput-object p2, p0, Ll9/g0;->b:Landroid/net/Uri;

    iput-object p3, p0, Ll9/g0;->c:Lcom/google/android/gms/dynamic/b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ll9/g0;->a:Ll9/c;

    iget-object v1, p0, Ll9/g0;->b:Landroid/net/Uri;

    iget-object v2, p0, Ll9/g0;->c:Lcom/google/android/gms/dynamic/b;

    invoke-virtual {v0, v1, v2}, Ll9/c;->K2(Landroid/net/Uri;Lcom/google/android/gms/dynamic/b;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
