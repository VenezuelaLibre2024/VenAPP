.class final Lg7/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field public final a:[Lg7/p;

.field public b:Lt6/u1;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [Lg7/p;

    iput-object p1, p0, Lg7/b$d;->a:[Lg7/p;

    const/4 p1, 0x0

    iput p1, p0, Lg7/b$d;->d:I

    return-void
.end method
