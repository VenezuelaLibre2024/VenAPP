.class final La8/f$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field public final a:Lb8/g$e;

.field public final b:J

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Lb8/g$e;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/f$e;->a:Lb8/g$e;

    iput-wide p2, p0, La8/f$e;->b:J

    iput p4, p0, La8/f$e;->c:I

    instance-of p2, p1, Lb8/g$b;

    if-eqz p2, :cond_0

    check-cast p1, Lb8/g$b;

    iget-boolean p1, p1, Lb8/g$b;->x:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, La8/f$e;->d:Z

    return-void
.end method
