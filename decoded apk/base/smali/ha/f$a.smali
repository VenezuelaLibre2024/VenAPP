.class public Lha/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lha/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private b:Z

.field private c:Lha/a;

.field private d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lha/f$a;->a:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lha/f$a;->b:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lha/f$a;
    .locals 1

    iget-object v0, p0, Lha/f$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lha/f;
    .locals 7

    new-instance v6, Lha/f;

    iget-object v1, p0, Lha/f$a;->a:Ljava/util/List;

    iget-object v2, p0, Lha/f$a;->c:Lha/a;

    iget-object v3, p0, Lha/f$a;->d:Ljava/util/concurrent/Executor;

    iget-boolean v4, p0, Lha/f$a;->b:Z

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lha/f;-><init>(Ljava/util/List;Lha/a;Ljava/util/concurrent/Executor;ZLha/k;)V

    return-object v6
.end method
