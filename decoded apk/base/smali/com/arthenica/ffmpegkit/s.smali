.class public Lcom/arthenica/ffmpegkit/s;
.super Lcom/arthenica/ffmpegkit/b;
.source "SourceFile"


# instance fields
.field private o:Lcom/arthenica/ffmpegkit/q;

.field private final p:Lcom/arthenica/ffmpegkit/t;


# direct methods
.method private constructor <init>([Ljava/lang/String;Lcom/arthenica/ffmpegkit/t;Lcom/arthenica/ffmpegkit/o;)V
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/p;->NEVER_PRINT_LOGS:Lcom/arthenica/ffmpegkit/p;

    invoke-direct {p0, p1, p3, v0}, Lcom/arthenica/ffmpegkit/b;-><init>([Ljava/lang/String;Lcom/arthenica/ffmpegkit/o;Lcom/arthenica/ffmpegkit/p;)V

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/s;->p:Lcom/arthenica/ffmpegkit/t;

    return-void
.end method

.method public static y([Ljava/lang/String;Lcom/arthenica/ffmpegkit/t;Lcom/arthenica/ffmpegkit/o;)Lcom/arthenica/ffmpegkit/s;
    .locals 1

    new-instance v0, Lcom/arthenica/ffmpegkit/s;

    invoke-direct {v0, p0, p1, p2}, Lcom/arthenica/ffmpegkit/s;-><init>([Ljava/lang/String;Lcom/arthenica/ffmpegkit/t;Lcom/arthenica/ffmpegkit/o;)V

    return-object v0
.end method


# virtual methods
.method public A()Lcom/arthenica/ffmpegkit/q;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/s;->o:Lcom/arthenica/ffmpegkit/q;

    return-object v0
.end method

.method public B(Lcom/arthenica/ffmpegkit/q;)V
    .locals 0

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/s;->o:Lcom/arthenica/ffmpegkit/q;

    return-void
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaInformationSession{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "sessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/arthenica/ffmpegkit/b;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->c:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->d:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->e:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", arguments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->f:[Ljava/lang/String;

    invoke-static {v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", logs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->j:Lcom/arthenica/ffmpegkit/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", returnCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->k:Lcom/arthenica/ffmpegkit/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", failStackTrace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/arthenica/ffmpegkit/b;->l:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z()Lcom/arthenica/ffmpegkit/t;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/s;->p:Lcom/arthenica/ffmpegkit/t;

    return-object v0
.end method
