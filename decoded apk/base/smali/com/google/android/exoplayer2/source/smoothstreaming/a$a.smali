.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/smoothstreaming/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ls8/j$a;


# direct methods
.method public constructor <init>(Ls8/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;->a:Ls8/j$a;

    return-void
.end method


# virtual methods
.method public a(Ls8/f0;Lf8/a;ILq8/r;Ls8/m0;)Lcom/google/android/exoplayer2/source/smoothstreaming/b;
    .locals 7

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;->a:Ls8/j$a;

    invoke-interface {v0}, Ls8/j$a;->a()Ls8/j;

    move-result-object v6

    if-eqz p5, :cond_0

    invoke-interface {v6, p5}, Ls8/j;->l(Ls8/m0;)V

    :cond_0
    new-instance p5, Lcom/google/android/exoplayer2/source/smoothstreaming/a;

    move-object v1, p5

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/source/smoothstreaming/a;-><init>(Ls8/f0;Lf8/a;ILq8/r;Ls8/j;)V

    return-object p5
.end method
