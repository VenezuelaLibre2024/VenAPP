.class public Lxf/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:Z

.field private final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIIIIIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lxf/a$b;->a:I

    iput p2, p0, Lxf/a$b;->b:I

    iput p3, p0, Lxf/a$b;->c:I

    iput p4, p0, Lxf/a$b;->d:I

    iput p5, p0, Lxf/a$b;->e:I

    iput p6, p0, Lxf/a$b;->f:I

    iput-boolean p7, p0, Lxf/a$b;->g:Z

    iput-object p8, p0, Lxf/a$b;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxf/a$b;->h:Ljava/lang/String;

    return-object v0
.end method
