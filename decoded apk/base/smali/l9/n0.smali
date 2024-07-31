.class public final synthetic Ll9/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ll9/c;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lcom/google/android/gms/dynamic/b;


# direct methods
.method public synthetic constructor <init>(Ll9/c;Ljava/util/List;Lcom/google/android/gms/dynamic/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/n0;->a:Ll9/c;

    iput-object p2, p0, Ll9/n0;->b:Ljava/util/List;

    iput-object p3, p0, Ll9/n0;->c:Lcom/google/android/gms/dynamic/b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ll9/n0;->a:Ll9/c;

    iget-object v1, p0, Ll9/n0;->b:Ljava/util/List;

    iget-object v2, p0, Ll9/n0;->c:Lcom/google/android/gms/dynamic/b;

    invoke-virtual {v0, v1, v2}, Ll9/c;->i2(Ljava/util/List;Lcom/google/android/gms/dynamic/b;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
