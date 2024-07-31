.class public final Lb8/g$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:J

.field public final d:J

.field public final e:Z


# direct methods
.method public constructor <init>(JZJJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lb8/g$f;->a:J

    iput-boolean p3, p0, Lb8/g$f;->b:Z

    iput-wide p4, p0, Lb8/g$f;->c:J

    iput-wide p6, p0, Lb8/g$f;->d:J

    iput-boolean p8, p0, Lb8/g$f;->e:Z

    return-void
.end method
